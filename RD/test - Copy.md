### 2. Html/Css/Javascript style
565665999999
* Css class name: [hyphens]

  ```html
  <element class="my-string" ... >
  ```

* Element id, name: [camelCase]

  ```html
  <element id="btnShare" name="btnShare" ... >
  ```

* Js variable: [camelCase]

  ```javascript
  var myString = '';
  ```
### 3. Rules for using javascript

* Style based on [ES6](https://www.w3schools.com/js/js_es6.asp) (newest is ES2024):
  * The let keyword allows you to declare a variable with block scope: `let x = 2;`
  * The const keyword allows you to declare a constant (a JavaScript variable with a constant value): `const x = 2;`
  * Arrow functions allows a short syntax for writing function expressions: `const x = (x, y) => x * y;`
  * ...

* Show message: use toast for success case, else dialog

  ```javascript
    // Success case — use toast
    showAlert("...", "success");

    // Error or warning case — use dialog
    showAlert("...", "error");

  ```