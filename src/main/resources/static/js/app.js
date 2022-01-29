ws= new WebSocket("ws://localhost:8080/pong");

ws.onopen = function (){
    action('open connection')
};
ws.onmessage = function (ev){
    action(ev.data)
};

ws.onerror = function (ev){}
ws.onclose = function (ev){}
function action(message){
    var output = document.getElementById("stack");
    var newP = document.createElement('p');
    newP.appendChild(document.createTextNode(message));
    output.appendChild(newP);
}

function ping(){
    var message = document.getElementById('message').value;
    action('sent:'+message);
    ws.send(message);
}
