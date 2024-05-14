let id =  document.getElementById('id').value;
let pass = document.getElementById("pass").value;
function  Hello(){
    if(id && pass){
        alert ("Welcome! You're logged in.");
        window.location.href='www.google.com';
        console.log(id , pass)
    }
    
}