// ws= new WebSocket("ws://localhost:8080/pong");
//
//
// ws.onopen = function (){
//     action('open connection')
// };
// ws.onmessage = function (ev){
//     action(ev.data)
// };
//
// ws.onerror = function(error) {
//     alert("Ошибка " + error.message);
// };
// ws.onclose = function(event) {
//     if (event.wasClean) {
//         alert('Соединение закрыто чисто');
//     } else {
//         alert('Обрыв соединения');  // при остановке сервера
//     }
//     alert('Код: '+ event.code +' причина: '+event.reason);
// };
// function action(message){
//     var output = document.getElementById("stack");
//     var newP = document.createElement('p');
//     newP.appendChild(document.createTextNode(message));
//     output.appendChild(newP);
// }
//
// function ping(){
//     var message = document.getElementById('message').value;
//     action('sent:'+message);
//     ws.send(message);
// }
