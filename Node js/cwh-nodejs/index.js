const { Console } = require("node:console");
const aniket= require("./import")
console.log("hello World")
console.log(aniket);

const os = require('node:os'); 
console.log(os.freemem());
console.log(os.hostname())
console.log(os.homedir());
console.log(os.type())


const path = require('path'); 
console.log(path.dirname('C:\\temp\\myfile.html'))
console.log(path.extname )


const fs= require('fs');
const a=fs.readFileSync('file.txt');
console.log(a.toString());


// fs.writeFileSync('file2.txt', " this is  a write file function using fsSync");
console.log(fs.readFileSync('file2.txt').toString());