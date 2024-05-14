const http = require('http');
const port= process.env.Port ||5000 ;

const server=  http.createServer((req,res)=>{
    res.setHeader('Content-type','text/html')
    console.log(req.url);

  

    
    if(req.url=="/about")
    {  res.statusCode=200;
        res.end('<h1> This JAISjaI to rock the world </h1>');
        
    }
    else if (req.url=="/"){
        res.statusCode=200;
        res.end('<h1> This is Anikets Server </h1>  <p> Hey this is the way to rock the world </p>');
        
    }
    else if(req.url=='/hello'){
        const fs= require('fs');

         const data =fs.readFileSync('index.html');

        res.statusCode=400;
        // req.Ans();
        res.end(data.toString());

    }
})
server.listen(port,()=>{

    console.log(`server is listening to you ${port}`)
});
