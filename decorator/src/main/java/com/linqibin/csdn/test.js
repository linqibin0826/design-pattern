window.onload = function () {
    let table = document.getElementById("tbl_fruit");
    let rows = table.rows;
    for (let i = 1; i <rows.length -1; i++) {
        rows[i].onmouseover = showBgColor;
        rows[i].onmouseout = removeBgColor;

        let cells = rows[i].cells;
        cells[1].onmouseover = showHand;
        cells[1].onclick = editPrice;
        // 绑定删除行事件
        cells[4].firstChild.onclick = delRow;
    }
    updateZJ()
}

function delRow() {
    let img = event.srcElement;
    let tr = img.parentElement.parentElement;
    if (window.confirm("是否确认删除该行?")) {
        let rowIndex = tr.rowIndex;
        let table = document.getElementById("tbl_fruit");
        table.deleteRow(rowIndex)
        updateZJ()
    }
}

function editPrice() {
    let srcElement = event.srcElement;

    // 文本节点
    if (srcElement.firstChild && srcElement.firstChild.nodeType == 3) {
        let text = srcElement.innerText;
        srcElement.innerHTML = "<input size='1' type='text'>"
        srcElement.firstChild.value = text
        srcElement.firstChild.select()
        srcElement.firstChild.onblur = updatePrice;

    }
}

function updatePrice() {
    let input = event.srcElement;
    let td = input.parentElement;
    td.innerText = input.value;
    updateXJ(td);
    updateZJ();
}

function updateXJ(td) {
    let cells = td.parentElement.cells;
    let count = cells[1].innerText;
    let price = cells[2].innerText;
    cells[3].innerText = parseInt(count) * parseInt(price);
}

function updateZJ() {
    let table = document.getElementById("tbl_fruit");
    let rows = table.rows;
    let sum = 0;
    for (let i = 1; i < rows.length - 1; i++) {
        let cells = rows[i].cells;
        let price = cells[3].innerText;
        sum = sum + parseInt(price);
    }
    rows[rows.length - 1].cells[1].innerText = sum;
}

function showBgColor() {
    if (event && event.srcElement && event.srcElement.tagName == "TD") {
        var td = event.srcElement;
        var tr = td.parentElement;
        tr.style.backgroundColor = "navy";

        // 拿到每个单元格
        var tds = tr.cells;
        for (let i = 0; i < tds.length; i++) {
            tds[i].style.color = "white"
        }

    }
}

function removeBgColor() {
    if (event && event.srcElement && event.srcElement.tagName == "TD") {
        var td = event.srcElement;
        var tr = td.parentElement;
        tr.style.backgroundColor = "transparent";
        var tds = tr.cells;
        for (let i = 0; i < tds.length; i++) {
            tds[i].style.color = "black"
        }
    }
}

function showHand() {
    let td = event.srcElement;
    td.style.cursor = "hand";
}

function addRow() {

}