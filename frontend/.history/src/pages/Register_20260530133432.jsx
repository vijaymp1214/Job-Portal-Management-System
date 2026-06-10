import "../styles/Login.css";
import { Link } from "react-router-dom";
function Register() {
  return (
    <div className="login-container">

      <div className="login-card">

        <h1 className="logo">
          🚀 Job Portal
        </h1>

        <p className="subtitle">
          Create your account
        </p>

        <input
          type="text"
          placeholder="Enter Full Name"
          className="custom-input"
        />

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
          Register
        </button>

        <p className="register-text">
          Already have an account?
          <span> Login</span>
        </p>

      </div>

    </div>
  );
}

export default Register;