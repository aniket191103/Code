const EventEmitter = require('node:events');

class MyEmitter extends EventEmitter {}

const myEmitter = new MyEmitter();
myEmitter.on('waterFull', () => {
  console.log('WaterTank is full!');
setTimeout(() => {
      console.log("heieieie");
},3000);
})
myEmitter.emit('waterFull');
console.log("code is still running")
