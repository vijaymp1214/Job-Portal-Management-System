import "../styles/Login.css";
import { Link } from "react-router-dom";
import { useState } from "react";
import axios from "axios";

<h1 className="logo">
  TEST LOGIN PAGE
</h1>
function Login() {

  
  const [email, setEmail] = useState("");
  const [password, setPassword] = useState("");

  const handleLogin = async () => {
    try {

      const response = await axios.post(
        "http://localhost:8080/users/login",
        {
          email: email,
          password: password
        }
      );

      console.log(response.data);

      alert("Login Successful");

    } catch (error) {

      console.log(error);

      alert("Login Failed");
    }
  };

  return (
    <div className="login-container">

      <div className="login-card">

        <h1 className="logo">
          🚀 Job Portal
        </h1>

        <p className="subtitle">
          Find your dream job today
        </p>

        <input
          type="email"
          placeholder="Enter Email"
          className="custom-input"
          onChange={(e) => setEmail(e.target.value)}
        />

        <input
          type="password"
          placeholder="Enter Password"
          className="custom-input"
          onChange={(e) => setPassword(e.target.value)}
        />

  <button onClick={() => alert("Clicked")}>
  Login
</button>

        <p className="register-text">
          Don't have an account?

          <Link
            to="/register"
            style={{
              color: "white",
              textDecoration: "none",
              fontWeight: "bold",
              marginLeft: "5px"
            }}
          >
            Register
          </Link>

        </p>

      </div>

    </div>
  );
}

export default Login;