$(function(){


      switch(menu){

         case 'About us' : 
                $('#about').addClass('active');
                break;
    case 'Contact Us' : 
                $('#contact').addClass('active');
                break;                
    case 'All Products': 
             $('#listProducts').addClass('active');
             break;                
    default:
    	    $('#listProducts').addClass('active');
            $('#a_'+menu).addClass('active');
             break;
   
}  //end of switch
});