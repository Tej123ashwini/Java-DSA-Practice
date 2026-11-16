// Method Chaining -- calling one method after another method in one line of code
//                 -- it reduces the variable initialization

// --------- No MC

let username = window.prompt("Enter the name: ");

// username = username.trim();
// let firstletter = username.charAt(0);
// firstletter = firstletter.toUpperCase();

// let remainingChars = username.slice(1);
// remainingChars = remainingChars.toLowerCase();
// username = firstletter + remainingChars;

// console.log(username);

// --------- With MC

username = username.trim().charAt(0).toUpperCase() + username.trim().slice(1).toLowerCase() ;
console.log(username);