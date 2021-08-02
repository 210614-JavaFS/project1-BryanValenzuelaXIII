const URL = 'http://localhost:8080/Pj1/';


let pendientes = document.getElementById("activarte");
pendientes.onclick = pendientesMostrar;


async function pendientesMostrar(){
    let response;
    /*response.header('Access-Control-Allow-Origin', "*");
     response = await fetch(URL + 'reimbursement');
    
    console.log(resultados);

    if(response.status === 200){
        let data = await response.json();*/
        let resultados = [{"ersId":3,"ersAmmount":200.96,"ersSumitted":1466644225000,
"userId":23,"estatus":"PENDING","tipo":"EDUCATION"},
{"ersId":5,"ersAmmount":350.2,"ersSumitted":1494727825000,
"userId":13,"estatus":"SUBMITTED","tipo":"TRAVEL"}];
        populatePending(resultados);
    /*}else{
        console.log("Couldn't reach data properly");
    }*/
};

function populatePending(resultados){
    let tbody = document.getElementById("tableBody");

    for(let peticion of resultados){
        let row = document.createElement("tr");

        for(let cell in peticion){
            let td = document.createElement("td");
            //if(cell == '')
           td.innerText = peticion[cell];
           //var lala = $("<button>Hi there</button>");
           row.addEventListener
            row.appendChild(td);
            
        }

        tbody.appendChild(row);
    }
};