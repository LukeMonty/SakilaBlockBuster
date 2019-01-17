let navBar = document.createElement("ul");
let node1 = document.createElement("li");
let node2 = document.createElement("li");
let node3 = document.createElement("li");
let node4 = document.createElement("li");
let a1 = document.createElement("a");
let a2 = document.createElement("a");
let a3 = document.createElement("a");
let a4 = document.createElement("a");

let homeNode = document.createTextNode("Home");
a1.appendChild(homeNode);
a1.href = "index.html";
node1.appendChild(a1);
let projectNode = document.createTextNode("Films");
a2.appendChild(projectNode);
a2.href = "films.html";
node2.appendChild(a2);
let meNode = document.createTextNode("Categories");
a3.appendChild(meNode);
a3.href = "";       //TODO hyperlinks
node3.appendChild(a3);
let actorNode = document.createTextNode("Actors");
a4.appendChild(actorNode);
a4.href = "";       //TODO hyperlinks
node4.appendChild(a4);

navBar.appendChild(node1);
navBar.appendChild(node2);
navBar.appendChild(node3);
navBar.appendChild(node4);
document.getElementById("navigation").appendChild(navBar);