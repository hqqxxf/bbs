define({
	hasClass: function(obj, classname){
		var reg = new RegExp('(\\s|^)' + classname + '(\\s|$)', "g");
		return reg.test(obj.className);
	},
    addClass: function(obj, classname){
    	if(!this.hasClass(obj,classname)){
    		obj.className += " " + classname;
    	}
    },
    removeClass: function(obj, classname){
    	if(this.hasClass(obj, classname)){
    		var reg = new RegExp('(\\s|^)' + classname + '(\\s|$)', "g");
    		obj.className = obj.className.replace(reg, ' ');
    	}
    },
    mergeObj: function(o1,o2){
       for(var key in o2){
           o1[key]=o2[key]
       }
       return o1;
    },
    ajax: function(option){
    	var defaults = {
    		url: '',
    		method: 'GET',
    		data: "",
    		async: true,
    		dataType: "JSON",
    		success: null,
    		error: null
    	};
    	var opts = this.mergeObj(defaults, option);
    	var xhr = XMLHttpRequest ? new XMLHttpRequest() : new ActiveXObject("Microsoft.XMLHTTP");
		xhr.open(opts.method, opts.url, opts.async);
		xhr.send(opts.data);
		xhr.onreadystatechange = function(){
			if(xhr.readyState == 4 && xhr.status == 200){
				opts.success.call(this, xhr.responseText);
			}else{
				opts.error.call(this, xhr.responseText);
			}
		}
		
	}
        
})
