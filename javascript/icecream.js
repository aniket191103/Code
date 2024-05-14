//  let order=()=>{
//     console.log("order placed,pls call production")
//     production();
//  }
//  let production=()=>{
// console.log("prder recieved < production started ")
//  }
//  order()




//  using promises 

let stocks = {
    Fruits : ["strawberry", "grapes", "banana", "apple"],
    liquid : ["water", "ice"],
    holder : ["cone", "cup", "stick"],
    toppings : ["chocolate", "peanuts"],
 };
 let is_stop_open=true;
 let aniket =()=>{
    setTimeout(()=>
    {
        console.log(" i am aniket")

    },2000)
}
 let order=( time,work)=>{
    return new Promise((resolve,reject)=>{
        if(is_stop_open){
            setTimeout(()=>{

                resolve(work())
            },time)
        }
        else{
            reject(console.log("out shop is closed"))
        }
    })

 }
 order(2000,()=>{
    console.log(` the  fruit you selected is ${stocks.Fruits[0]}`)
 })


 .then(()=>{
    return order(0000,()=>console.log(" production has started"));
 })

 .then(()=>{
    return order(2000, ()=>{
        console.log(" the fruit is chopped")
    })
 })

 .then(()=>
 {
    return order(1000, ()=>{
        console.log(`${stocks.liquid[0]} is selected along with ${stocks.liquid[1]} `)
    })
 }
 )
 
 .then(()=>{
    return order(1000,()=>{console.log("start the machine")

    })
 }
 )


.then(()=>{
    // aniket()
    return order(2000, ()=>{
        console.log(` ice cream is placed ${stocks.holder[0]}  `)
    })

})

.then(()=>
{
    return order(1000,()=>{
        console.log("icecream is served")
    })
})


.catch(()=>
{
 console.log('customer left' );
})



.finally(()=>
{
    console.log("day ended shop is closed")
})