
// books = [[ID, "BOOK NAME", "AUTHOR NAME",PRICE , QUANTITY]]
let books = [
    [1, 'Start with why', 'Simon Sinek', 80.0, 13],
    [2, 'But how do it know', 'J.Clark Scott', 59.9, 22],
    [3, 'Clean Code', 'Robert Cecil Martin', 50.0, 5],
    [4, 'Zero to One', 'Peter Theil', 45.0, 12],
    [5, 'You dont know JS', 'Kyle Simpson', 39.9, 9]
]
let invoiceNo = 0;
b = [5, 'You dont know JS', 'Kyle Simpson', 39.9, 1]
c = [3, 'Clean Code', 'Kyle Simpson', 39.9, 3]

// sellingAndInvoice(b[1], 5);
// sellingAndInvoice(c[1], 1);
// sellingAndInvoice(c[1], 1);
function add(b) {
    let newId;
    let newName;
    let flag = false;
    for (let i = 0; i < books.length; i++) {
        for (let j = 0; j < books[i].length; j++) {

            newId = books[i][0];
            newName = books[i][1];

            if (newId == (b[0]) || newName == (b[1])) {
                flag = true
            }
        }
    }
    if (flag == false) {
        books.push(b);
        console.log(books);
    }
}

function edit(b) {
    let newId, updatedBook;
    for (let i = 0; i < books.length; i++) {
        newId = books[i][0];
        // console.log(i);
        if (newId == (b[0])) {
            books[i] = b;
            console.log("updatedbooks: ", b);
        }
    } console.log(books)
}

function deleteBook(b) {
    let newId;
    for (let i = 0; i < books.length; i++) {
        newId = books[i][0];
        if (newId == b[0]) {
            books[i].splice(0, i);
            console.log(books);
        }
    }
}

function viewAll() {
    console.log(books)
}

function inquire(b) {
    let flag = false;
    for (let i = 0; i < books.length; i++) {
        if (
            b == books[i][0] ||
            b == books[i][1] ||
            b == books[i][2]) {
            console.log(books[i]);
            flag = true;
        }

    }

    if (!flag) {
        console.log("book not available");
    }

}

function sellingAndInvoice(a, b) {

    for (let i = 0; i < books.length; i++) {
        let remainingBooks = books[i][4] - b;
        let invoice;

        // remainingBooks = books[i][4]
        if (a == books[i][0] ||
            a == books[i][1]) {
            if (b <= books[i][4]) {
                invoiceNo = invoiceNo + 1;
                // console.log("books sold");
                // console.log(remainingBooks);
                books[i][4] = remainingBooks;
                invoice = function () {
                    console.log("Invoice No: " + invoiceNo
                        + "\nBooks purchased: " + books[i][1]
                        + "\nWith Quantity: " + b
                        + "\nPrice: " + books[i][3]
                        + "\nTotal Price: " + b * books[i][3]);
                }

                invoice();
            }
            else {
                console.log("books are out of stock. we have" +
                    " " + books[i][4] + " books");

            }

        }
    }

}