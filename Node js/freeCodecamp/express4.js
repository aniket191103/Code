const express= require('express')
const app= express()
const morgan= require('morgan')
const logger= require('./logge')
const authorize= require('./authorize')

//req=> middelwware=> res
// app.use([logger,authorize])
// app.use(express.static('./node-express-course/02-express-tutorial/public'))
app.use(morgan('tiny'))

app.get('/',(req,res)=>{
    
    res.send('home')
        
    })
    app.get('/about',(req,res)=>{
    
        res.send('about')
            
        })
         app.get('/api/product',(req,res)=>{
    
            res.send('product')
                
            })
            app.get('/api/items',(req,res)=>{
    
                console.log(req.user)
                res.send('items')
                    
                })



app.listen(5000,()=>{
console.log('server is listenning to you on 3000')
})
