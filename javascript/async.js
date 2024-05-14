const prompt = require("prompt-sync")();
let stocks = {
  Fruits: ["strawberry", "grapes", "banana", "apple"],
  liquid: ["water", "ice"],
  holder: ["cone", "cup", "stick"],
  toppings: ["chocolate", "peanuts"],
};

let x = prompt("enter");
let is_stop_open = true;
// let topic_choice=()=>
// {
//     return new Promise((resolve,reject)=>{

//         setTimeout(()=>{
//             resolve(

//                 console.log("what wil yp=ou have a")
//                 )

//         },1000)
//     })
// }

// async function kitchen(){
//     console.log("a")
//     console.log("b")
//     console.log("c")
//     await topic_choice()
//     console.log("d")
//     console.log("e")
// }

// kitchen()
// console.log("cleaning the dishes ")
// console.log("cleaning the tables ")
// console.log("cleaning the tables ")
// console.log("cleaning the tables ")
// console.log("cleaning the tables ")

function time(ms) {
  return new Promise((resolve, reject) => {
    if (is_stop_open) {
      setTimeout(resolve, ms);
    } else reject(console.log("shop is closed"));
  });
}

async function kitchen() {
  try {
    await time(2000);
    console.log(` ${stocks.Fruits[0]}`);
  } catch (error) {
    console.log("custommer left ", error);
  } finally {
    console.log("day end");
  }
}
kitchen();
