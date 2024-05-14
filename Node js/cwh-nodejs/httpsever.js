const http = require('http');
const fs = require('fs')

const port= process.env.Port ||5000 ;

const server=  http.createServer((req,res)=>{
    // console.log(req.url);
     if(req.url==='/'){

         res.statusCode=200;
         res.setHeader('Content-type','text/html')
         res.end("<h1> This is a  Aniket's Server  </h1>  <p>listening on Port 4500 </p>");
        }
        else if(req.url ==='/home'){
            const data =fs.readFileSync('./index.html');

            res.statusCode=200;
            // req.Ans();
            res.end(data.toString());
        }
        else{
             res.statusCode=404;
             res.setHeader('Content-type','text/html')
              res.end('<h1> Not Found </h1>')
        }

})
server.listen(port,()=>{

    console.log(`server is listening to you ${port}`)
});