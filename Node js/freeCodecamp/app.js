// //module
// const name=  require('./names')
// // console.log(name);

// const data= require('./alternative flavour')
// // console.log(data);


// require('./mind-grenade')


//  const os= require("os")
//  console.log(os.userInfo())
//  console.log(os.uptime())



//  const lo= require('lodash');
//  const item =[1,[2,[3,[4]]]];
//   const NewItem= lo.flattenDeep(item);
//   console.log(NewItem)


const fs = require('fs');
for(i=0;i<=1000;i++){
    fs.writeFileSync('big.txt', ` this is  a write file function using fsSync   ${i} \n` ,{flag:'a'});
}




//STreams 
const {createReadStream }= require('fs');

const stream =createReadStream('./big.txt');
stream.on('data', (result)=>{
    console.log(result.toString())
})
stream.on('error',(err)=>{
    console.log(err)
})