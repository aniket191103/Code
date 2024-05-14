const express= require('express')
const app= express()
const morgan= require('morgan')
const logger= require('./logge')
const authorize= require('./authorize')
const path = require('path');
//req=> middelwware=> res
// app.use([logger,authorize])
// app.use(express.static('./node-express-course/02-express-tutorial/public'))
app.use(morgan('tiny'))

app.get('/', (req, res) => {
    res.sendFile(path.resolve(__dirname, 'birth.html'))
  })
        



app.listen(5000,()=>{
console.log('server is listenning to you on 5000')
})