//获取XMLHttpRequest对象
function getXMLHttpRequest(){
	//IE7+,FireFox,Chrome,Opera,Sarari
	if(window.XMLHttpRequest){
		xmlHttp = new XMLHttpRequest();
	}else{
		xmlHttp = new ActiveXObject("Microsoft.XMLHTTP");
	}
	return xmlHttp;
}

