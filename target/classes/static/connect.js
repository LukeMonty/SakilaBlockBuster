

////////////////// Sorry about of this code

function search() {
    let requestURL = "http://192.168.1.102:9000/api/filmList";
    let request = new XMLHttpRequest();
    request.open("GET", requestURL);
    request.responseType = "json";
    request.send();

    let search = document.getElementById("search").value;
    if (search != "") {

        request.onload = function() {


            let myNode = document.getElementById("results");
            while (myNode.firstChild){
                myNode.removeChild(myNode.firstChild);
            }

            let requestData = request.response;
            let myH1 = document.createElement("p");
            let d = requestData[1].actors.split(", ");
            console.log(requestData[1].actors.split(", ")[1]);

            let arr = []; // Array storing a list of actors found
            for (let i = 0; i < requestData.length; i++){
                    
                if (requestData[i].title.includes(search.toUpperCase())){
              
                    let card = document.createElement("div");
                    card.setAttribute("class", "card");
                    let cardBody = document.createElement("div");
                    cardBody.setAttribute("class", "card-body");
                    let cardTitle = document.createElement("h5");
                    cardTitle.setAttribute("class", "card-title");
                    cardTitle.textContent = requestData[i].title;
                    let cardText = document.createElement("p");
                    cardText.textContent = requestData[i].description;
                    let cardTextSmall = document.createElement("p");
                    let small = document.createElement("small");
                    
                    cardTextSmall.setAttribute("class", "card-text");
                    cardText.setAttribute("class", "card-text");
                    
                    small.setAttribute("class", "text-muted");
                    small.textContent = requestData[i].category;
                    cardTextSmall.appendChild(small);
                    card.appendChild(cardBody);
                    card.appendChild(cardTitle);
                    card.appendChild(cardText);
                    card.appendChild(cardTextSmall);


                    document.getElementById("results").appendChild(card);
                }


                // let s = requestData[i].actors.split(", ");
                
                // for(let j = 0; j < s.length; j++){
                    
                //     if (s[j].includes(search.toUpperCase()) && !(arr.includes(s[j]))){
                //         arr.push(s[j]);
                //         for(let k = 0; k < arr.length; k++){

                //             let myH1 = document.createElement("p");
                //             myH1.textContent = arr[k];
                //             document.getElementById("results").appendChild(myH1);
                //         }
                //     }
                // }
            }
        }
    }
}