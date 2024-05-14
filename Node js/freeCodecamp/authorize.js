const authorize= (req,res,next)=>{
    const {user}= req.query;
    if(user==='john'){
        req.user={name:'john',id:3,
    name:'aniket',id :58}
        next()
    }
    else{
        res.status(404).send(' not found')
    }
}

module.exports=authorize;