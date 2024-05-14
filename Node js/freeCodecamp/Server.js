// const http = require('http');
// const port=5000;
// const server =http.createServer((req,res)=>{
//     if (req.url=='/'){
//         res.setHeader('Content-type','text/html')
//         res.statusCode=200
//     res.end(` <h1> hi i a welcome page to your website </h1> `)
//     }


// })
// server.listen(port,(req,res)=>{
//     console.log(`the server is running at ${port}`)
// })




const fs = require('fs')
;
fs.writeFile('hi.txt',"HI I AM NEW ",(err,data)=>{
    if (err){
        console.log(err)
    }
})


// fs.readFile('')