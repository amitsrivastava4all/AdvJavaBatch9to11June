/**
 * 
 */

function validate(){
	var userid = document.getElementById("userid").value;
	if(!(userid && userid.trim().length>0)){
		document.getElementById("useriderror").innerHTML = "userid can't be blank";
	}
	else{
		document.getElementById("useriderror").innerHTML = "";
	}
}
function doAjaxCall()
{
	//console.log("Form Serialize is "+$("#f1").serialize());

	//var myKeyVals = { A1984 : 1, A9873 : 5, A1674 : 2, A8724 : 1, A3574 : 3, A1165 : 5 }
	var userid = document.getElementById("userid").value;
	var pwd = document.getElementById("pwd").value;
	var data = "userid="+userid+"&pwd="+pwd;
	var saveData = $.ajax({
	      type: 'POST',
	      url: "showjson",
	      data: data,
	      dataType: "json",
	      success: function(resultData) { alert("Success "+resultData) }
	});
	saveData.error(function() { alert("Something went wrong"); });	
}



function beforeSubmit(){
	alert("Before Submit Call "+event);
	var userid = document.getElementById("userid").value;

	if(userid.trim().length==0){
		return false;
	}
	else{
	//document.getElementById("f1").submit();
	return true;
	}
}