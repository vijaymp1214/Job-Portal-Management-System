function App() {
  return (
    <div
      className="d-flex justify-content-center align-items-center vh-100"
      style={{
        background: "linear-gradient(135deg, #667eea, #764ba2)",
      }}
    >
      <div
        className="card shadow-lg border-0"
        style={{
          width: "100%",
          maxWidth: "450px",
          borderRadius: "20px",
        }}
      >
        <div className="card-body p-5">

          <div className="text-center mb-4">
            <h1 className="fw-bold">🚀 Job Portal</h1>
            <p className="text-muted">
              Welcome Back
            </p>
          </div>

          <div className="mb-3">
            <label className="form-label fw-semibold">
              Email Address
            </label>
            <input
              type="email"
              className="form-control form-control-lg"
              placeholder="Enter your email"
            />
          </div>

          <div className="mb-3">
            <label className="form-label fw-semibold">
              Password
            </label>
            <input
              type="password"
              className="form-control form-control-lg"
              placeholder="Enter your password"
            />
          </div>

          <div className="d-flex justify-content-between mb-3">
            <div>
              <input
                type="checkbox"
                className="form-check-input me-2"
              />
              Remember Me
            </div>

            <a
              href="#"
              className="text-decoration-none"
            >
              Forgot Password?
            </a>
          </div>

          <button
            className="btn btn-primary btn-lg w-100"
          >
            Login
          </button>

          <hr />

          <p className="text-center mb-0">
            Don't have an account?
            <a
              href="#"
              className="text-decoration-none ms-2 fw-bold"
            >
              Register
            </a>
          </p>

        </div>
      </div>
    </div>
  );
}

export default App;