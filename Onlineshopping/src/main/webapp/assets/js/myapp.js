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
    	    if(menu == "Home") break;
    	    $('#listProducts').addClass('active');
            $('#a_'+menu).addClass('active');
             break;
   
}  //end of switch
      
      //code for DataTable
      //create a dataSet
     
      
      /*
      var products = [
    	  
    	  ['1','AbcMobiles'],
    	  ['2','AbcMobiles2'],
    	  ['3','AbcMobiles3'],
    	  ['4','AbcMobiles4'],
    	  ['5','AbcMobiles5'],
    	  ['6','RedMi1'],
    	  ['7','Opp'],
    	  ['8','Lenovo'],
    	  ['9','Accer'],
    	  ['10','CBZ XTREME'],
	         
    	   
      ];
      
     */
     
      var $table = $('#dt-select');
      
      if ($table.length)
    	  {
    	  
    	  //decalre a Json variable
    	  var jsonUrl = '';
    	  
    	  if(window.categoryId =='')
    		  {
    		    jsonUrl = window.contextroot + '/json/data/all/products';
    		  } else{
    			  
    			  jsonUrl = window.contextroot+ '/json/data/category/'+window.categoryId+'/products';
    		  }
    		  
    	  
    	  }
      
       $table.DataTable(
    		   
         {  
        	 pageLength:3,
        	 ajax:{
        		 
        		 url:jsonUrl,
        		 dataSrc: ''
        	 },
        	 columns: [
        		        {
        		        	data: 'code',
        		        	mRender:function(data,type,row)
        		        	{
        		        		return '<img src="'+window.contextroot+'/resources/images/'+data+'.jpg" class="dataTableImg"/>';
        		        	}
        		        },
        		 
        		       {
        		    	    data : 'name'
        		        },
        		        {
       		    	        data : 'brand'
       		            },
       		            {
        		    	    data : 'unitPrice',
        		    	    mRender:function(data,type,row){
        		    	    	
        		    	    	return '&#8377;  '+data;
        		    	    }
        		        },
        		        {
        		        	data  :'quantity'
        		        },
        		        {
        		        	data: 'id',
        		        	bSortable:false,
        		        	mRender:function(data,type,row)
        		        	{
        		        		var str = '';
        		                str+='<a href="'+window.contextroot+'/show/'+data+'/product" class="btn btn-primary"><span class="glyphicon glyphicon-eye-open"></span>View</a> &#160;&#160;';                                
        		                
        		                str+='<a href="'+window.contextroot+'/cart/add/'+data+'/product" class="btn btn-success"><span class="glyphicon glyphicon-shopping-cart">Add</span></a>';
        		                
        		                return str;
        		        	}
        		        }
        		 
        	 ]
        		 
        		 
        		 
        		 
        		 
        		 
        		 
         }
       );
     
      
     
    
      
});



