import { useState } from "react";
import reactLogo from "./assets/react.svg";
import viteLogo from "/vite.svg";
import "./App.css";

function App() {
  return (
    <div className="p-6 min-h-screen bg-gray-100">
      <h1 className="text-3xl font-bold mb-6 text-blue-600">My Shop</h1>

      <div className="max-w-sm bg-white p-5 rounded-xl shadow-md">
        <img
          src="https://fakestoreapi.com/img/61pHAEJ4NML._AC_UX679_t.png"
          alt="product"
          className="rounded-lg mb-3"
        />

        <h2 className="text-xl font-semibold">Parfum Enak</h2>
        <p className="text-gray-600 mb-4">Rp 150.000</p>

        <button className="px-4 py-2 bg-blue-500 text-white rounded-lg hover:bg-blue-600 duration-200">
          Add to Cart
        </button>
      </div>
    </div>
  );
}


export default App;
