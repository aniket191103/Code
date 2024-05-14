const http = require('http');
const port= process.env.Port ||4500 ;

const server=  http.createServer((req,res)=>{
    console.log(req.url);
    res.statusCode=200;
    res.setHeader('Content-type','text/html')
    res.end("<h1> This is a  keshav's Server </h1>  <p>listening on Port 4500 </p>");

})
server.listen(port,()=>{

    console.log(`server is listening to you ${port}`)
});