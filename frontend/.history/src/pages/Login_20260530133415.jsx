import "../styles/Login.css";
import { Link } from "react-router-dom";
function Login() {
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
        />

        <input
          type="password"
          placeholder="Enter Password"
          className="custom-input"
        />

        <button className="login-btn">
          Login
        </button>

        <p className="register-text">
          Don't have an account?
          <span> Register</span>
        </p>
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