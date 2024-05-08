let element=document.querySelectorAll(".hide");
let observer= new IntersectionObserver((elem)=>{
    elem.forEach(entry => {
        if(entry.isIntersecting){
            entry.target.classList.add('show');
        }
        else{
            entry.target.classList.remove('show');
        }
    });
});
element.forEach((el)=>{
    observer.observe(el)
});
let himanshu=document.querySelector("#himanshu");
setTimeout(()=>{
    himanshu.style.color="red";
},1500);
const linkedin=document.querySelector("#linkedin");
const twitter=document.querySelector("#twitter");
const github=document.querySelector("#github");
const instagram=document.querySelector("#instagram");
linkedin.addEventListener('click',()=>{
    window.location.href="https://www.linkedin.com/in/himanshu-sekhar-parida/";
})
twitter.addEventListener('click',()=>{
    window.location.href="https://twitter.com/himanshuparida_";
})
instagram.addEventListener('click',()=>{
    window.location.href="https://www.instagram.com/himanshuparida.ig/?hl=en";
})
github.addEventListener('click',()=>{
    window.location.href="https://github.com/Himanshuparida2";
})
let image=document.querySelectorAll(".image");
let rev=new IntersectionObserver((element1)=>{
    element1.forEach((ent)=>{
        if(ent.isIntersecting){
            ent.target.classList.add('showImage');
        }
        else{
            ent.target.classList.remove('showImage');
        }
    });
});
image.forEach((element)=>{
    rev.observe(element)
});