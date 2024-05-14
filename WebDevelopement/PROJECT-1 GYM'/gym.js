function  displaytime()
{
  let time= new Date()
    console.log(time);
    document.getElementById("time").innerHTML=time;
    setInterval(displaytime,1000);
}


function FN()
{
    let Fname= document.getElementById("Fname").value;
    if(Fname.length =="" || Fname.length==null)
    {
        alert(" FIRST NAME CANT BE EMPTY ");
    } 
     else if(Fname.length <6 || Fname.length>10)
    {
        alert("name should me in range of 6-10 alphabets ")
    }

    let Lname= document.getElementById("Lname").value;
    if(Lname.length =="" || Lname.length==null)
    {
        alert(" LAST NAME CANT BE EMPTY ");
    } 
     else if(Lname.length <6 || Lname.length>20)
    {
        alert("LAST NAME  should me in range of 6-10 alphabets ")
    }
    let add = document.getElementById("add").value;
    if(add.length =="" || add.length==null)
    {
        alert("ADDRESS CANT BE EMPTY ");
    } 
     else if(add.length <6 ||add.length>20)
    {
        alert("ADDRESS  should me in range of 6-10 alphabets ")
    }
    
 }
 