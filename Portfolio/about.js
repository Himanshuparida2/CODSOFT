const hide=document.querySelectorAll(".hide");
let observer=new IntersectionObserver((ele)=>{
    ele.forEach(entry=>{
        if(entry.isIntersecting){
            entry.target.classList.add('show');
        }
        else{
            entry.target.classList.remove('show');
        }
    });
});
hide.forEach((en)=>{
    observer.observe(en);
});
let mail=document.querySelector("#mail");
mail.addEventListener('click',()=>{
    window.location.href="mailto:himanshuparida27@gmail.com";
});