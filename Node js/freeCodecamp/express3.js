const app= require('express')()
const {products}=require('./data')

app.get('/', (req,res)=>{
    res.send('<h1> Home Page</h1> <a href="./node-express-course/04-store-api/final/controllers/products.js">Click</a>')
    // res.json(products)
})


app.get('/node-express-course/04-store-api/final/controllers/products.js/',(req,res)=>{
   const newProducts= products.map((product)=>{
    const{id,name,image}=product
return{id,name,image}
   })
   res.json(newProducts)
    
})


app.get('/node-express-course/04-store-api/final/controllers/products.js/:ProductID',(req,res)=>{
console.log(req);
console.log(req.params.ProductID)


const {ProductID}= req.params;

    const singlePRodcuts = products.fi
    nd((products)=>products.id===Number(ProductID))

    if(!singlePRodcuts){
        return res.status(404).send('Not Found')
    }

    res.json(singlePRodcuts)
})



app.get('/api/v1/query',(req,res)=>{
// console.log(req.query)
const{search,limit}=req.query
let sortedProduct=[...products];
if(search){
    sortedProduct=sortedProduct.filter((products)=>{
        return products.name.startsWith(search)
    })
}

if(limit)
{
    sortedProduct=sortedProduct.slice(0,Number(limit))
}

if(sortedProduct.length<1){
return res.status(200).send('<h1>nott found</h1>')
}
// res.send('hello world')
return res.status(200).json(sortedProduct)
})
app.listen(5000,()=>{
    console.log(' i am 5000')
})