const express= require('express');
const path = require('path')


const app= express();

//setup and middleware
app.use(express.static('./navbar-app'))

// app.get('/',(req,res)=>{
// // res.sendFile(path.resolve(__dirname,'./navbar-app/index.html'))
// // // res.send("hi ")
//adding to static
// // })




app.all('*',(req,res)=>{
    res.status(404).send(' not found')
      })

app.listen(5000,()=>{
console.log('  listning got 5000')
})