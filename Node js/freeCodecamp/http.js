const http = require('http');
const server= http.createServer((req,res)=>{

     if(req.url==='/about'){
        res.end(' i am about')
       
     }
     else if(req.url==='/'){

         res.end('hello i am aniket');
       
        }
        else {

            res.end(`
             <h1> not able  to find your link</h1>
               <a href="/"> back home</a>`)
        }
})

server.listen(5000)

console.log(`server is listening on  5000`)