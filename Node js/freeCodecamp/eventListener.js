const event = require('events');
const customEmitter = new event()

  customEmitter.on('response',(name , id)=>{
    console.log( `data recieved  with anme ${name} with id ${ id}`)
  })

  customEmitter.on('response',()=>{
    console.log(' data some other')
  })

  customEmitter.emit('response', 'john ',25)
