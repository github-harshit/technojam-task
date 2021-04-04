function countwords(s){
    
   var s= document.getElementById('words').value;
   s = s.replace(/(^\s*)|(\s*$)/gi,"");//exclude  start and end white-space
   s = s.replace(/[ ]{2,}/gi," ");//2 or more space to 1
   s = s.replace(/\n /,"\n"); // exclude newline with a start spacing
   var foc= s.split(' ').filter(function(str){return str!="";}).length;
  
   document.getElementById("showdata").innerHTML="Total number of words in paragraph are = " + foc;
}
