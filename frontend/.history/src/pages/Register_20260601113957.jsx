import "../styles/Login.css";
import { Link } from "react-router-dom";

function Register() {
  return (
    <div className="login-container">
      <div className="login-card">

        <h1 className="logo">🚀 Job Portal</h1>

        <p className="subtitle">
          Create Your Account
        </p>

        <input
          type="text"
          placeholder="Enter Name"
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

        <button
          className="login-btn"
          onClick={() => alert("Register Button Working")}
        >
          Register
        </button>

        <p className="register-text">
          Already have an account?

          <Link
            to="/"
            style={{
              color: "white",
              textDecoration: "none",
              fontWeight: "bold",
              marginLeft: "5px"
            }}
          >
            Login
          </Link>
        </p>

      </div>
    </div>
  );
}

export default Register;