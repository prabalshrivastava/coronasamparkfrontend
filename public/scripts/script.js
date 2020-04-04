//Global Objects
var lstStates={};
var cases_state_district=[];
var stats_statewise=[];
var district_statewise=[];

var request = new XMLHttpRequest();

//https://api.covid19india.org/state_district_wise.json
request.open('GET', 'https://api.covid19india.org/state_district_wise.json', true)
request.onload = function() {
  // Begin accessing JSON data here
  var data = JSON.parse(this.response)

  if (request.status >= 200 && request.status < 400) {
    cases_state_district=data;
    //console.log(cases_state_district);
    lstStates=Object.keys(data);
   // console.log(lstStates);
    
  } else {
    console.log('request error')
  }
}

request.send();


//get statewise stats
//https://api.covid19india.org/data.json
var request_statewise = new XMLHttpRequest();
request_statewise.open('GET', 'https://api.covid19india.org/data.json', true)
request_statewise.onload = function() {
  // Begin accessing JSON data here
  var data = JSON.parse(this.response)

  if (request_statewise.status >= 200 && request_statewise.status < 400) {
    stats_statewise=data;
    //console.log(stats_statewise);
    var cases_india=$.grep(stats_statewise.statewise,function(obj){return obj.state=="Total"})[0];
    var casesConfirmed=document.getElementById('cases_confirmed');
    casesConfirmed.innerText=cases_india.confirmed;
    var casesRecovered=document.getElementById('cases_recovered');
    casesRecovered.innerText=cases_india.recovered;
    var casesDeceased=document.getElementById('cases_deceased');
    casesDeceased.innerText=cases_india.deaths;
    var casesActive=document.getElementById('cases_active');
    casesActive.innerText=cases_india.active;
    //console.log(cases_india);

    var telangana_info=$.grep(stats_statewise.statewise,function(obj){return obj.state=="Telangana"})[0];
    document.getElementById('telangana_confirmed').innerText=telangana_info.confirmed;
    document.getElementById('telangana_active').innerText=telangana_info.active;
    document.getElementById('telangana_recovered').innerText=telangana_info.recovered;
    document.getElementById('telangana_deceased').innerText=telangana_info.deaths;
    document.getElementById('tprogress_active').style.width=(telangana_info.active/telangana_info.confirmed)*100+'%';
    document.getElementById('tprogress_recovered').style.width=(telangana_info.recovered/telangana_info.confirmed)*100+'%';
    document.getElementById('tprogress_deceased').style.width=(telangana_info.deaths/telangana_info.confirmed)*100+'%';

    CollapseStateDiv('Telangana');
  } else {
    console.log('request_statewise error')
  }
}

request_statewise.send();


//get district stats
//https://api.covid19india.org/state_district_wise.json
var request_districtwise = new XMLHttpRequest();
request_districtwise.open('GET', 'https://api.covid19india.org/state_district_wise.json', true)
request_districtwise.onload = function() {
  // Begin accessing JSON data here
  var data = JSON.parse(this.response)

  if (request_districtwise.status >= 200 && request_districtwise.status < 400) {
    stats_districtwise=data; 
    console.log(stats_districtwise);
    let hyderabad_info=stats_districtwise.Telangana.districtData.Hyderabad;//$.grep(district_statewise.statewise,function(obj){return obj.state=="Telangana"})[0];
    console.log(hyderabad_info);
    let hconfirmed=hyderabad_info.confirmed==undefined?0:hyderabad_info.confirmed;
    let hactive=hyderabad_info.active==undefined?0:hyderabad_info.active;
    let hrecovered=hyderabad_info.recovered==undefined?0:hyderabad_info.recovered;
    let hdeceased=hyderabad_info.deaths==undefined?0:hyderabad_info.deaths;
    
    document.getElementById('hyderabad_confirmed').innerText=hconfirmed;
    document.getElementById('hyderabad_active').innerText=hactive;
    document.getElementById('hyderabad_recovered').innerText=hrecovered;
    document.getElementById('hyderabad_deceased').innerText=hdeceased;
    document.getElementById('hprogress_active').style.width=(hactive/hconfirmed)*100+'%';
    document.getElementById('hprogress_recovered').style.width=(hrecovered/hconfirmed)*100+'%';
    document.getElementById('hprogress_deceased').style.width=(hdeceased?undefined:0/hconfirmed)*100+'%';

    
    
  } else {
    console.log('error')
  }
}

request_districtwise.send();


function CollapseStateDiv(state){
  console.log(state);
  let state_info=$.grep(stats_statewise.statewise,function(obj){return obj.state==state})[0];
  console.log("hello");
  console.log(state_info);
  let state_img=document.getElementById('img_state');
  state_img.src="images/States/"+state+".jpg";
  document.getElementById('StateName').innerText=state.toUpperCase();
  document.getElementById('state_confirmed').innerText=state_info.confirmed;
  document.getElementById('state_active').innerText=state_info.active;
  document.getElementById('state_recovered').innerText=state_info.recovered;
  document.getElementById('state_deceased').innerText=state_info.deaths;
  document.getElementById('progress_active').style.width=(state_info.active/state_info.confirmed)*100+'%';
  document.getElementById('progress_recovered').style.width=(state_info.recovered/state_info.confirmed)*100+'%';
  document.getElementById('progress_deceased').style.width=(state_info.deaths/state_info.confirmed)*100+'%';
  
  
  $('#CollapseState').show();
}

