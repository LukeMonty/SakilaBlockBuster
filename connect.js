
function search() {
    let requestURL = "http://127.0.0.1:8080/api/filmList";
    let request = new XMLHttpRequest();
    request.open("GET", requestURL);
    request.responseType = "json";
    request.send();

    let search = document.getElementById("search").value;
    if (search != "") {

        request.onload = function() {

            let requestData = request.response;
            let myH1 = document.createElement("p");
            for (let i = 0; i < requestData.length; i++){
                    
                if (requestData[i].title.includes(search.toUpperCase())){
                    
                    console.log(requestData[i].actors.split(",").includes(search.toUpperCase()));
                    let myH1 = document.createElement("p");
                    myH1.textContent = requestData[i].title;
                    document.getElementById("results").appendChild(myH1);
                }
                if (requestData[i].actors.split(",").includes(search.toUpperCase())){
                    console.log("hi");
                    let myH1 = document.createElement("p");
                    myH1.textContent = requestData[i].actors;
                    document.getElementById("results").appendChild(myH1);
                }
               
            }
        }
    }
}