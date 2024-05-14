// // const person = {
// //     name : 'Jack',
// //     age: 25,
// //     // this inside method
// //     // this refers to the object itself
// //     greet() {
// //     console.log(this); // {name: "Jack", age ...}
// //     console.log(this.age); // 25
// //     // inner function
// //     function innerFunc() {
    
// //     // this refers to the global object
// //     console.log(this); // Window { ... }
// //     console.log(this.age); // undefined
// //     }
// //     innerFunc();
// //     }
// //    }
// //    person.greet()
// x=389;
// console.log(x);
// var x=9;
// // 'use strict';
// // this.name = 'Jack';
// // function greet() {
// //  console.log(this.name);
// // }
// // x=9;
// // console.log(x);
// // greet(this); // Jack



// // for (var val = 0; val < 10; val++) {
// //     console.log(val);
// //     setTimeout(()=>{

// //         console.log(`The number is ${val}`);
// //     }, 1000);
// // }


// for (const i = 0; i < 10; i++) {
//  console.log(i);
//  setTimeout(function() {
//  console.log(`The number is ${i}`);
//  },1000)
// }