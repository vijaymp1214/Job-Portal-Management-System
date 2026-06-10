function App() {
  return (
    <div
      className="d-flex justify-content-center align-items-center vh-100"
      style={{
        background: "linear-gradient(to right, #4facfe, #00f2fe)",
      }}
    >
      <div
        className="card shadow-lg border-0 p-4"
        style={{
          width: "100%",
          maxWidth: "420px",
          borderRadius: "20px",
        }}
      >
        <div className="text-center mb-4">
          <h1 className="fw-bold">Job Portal 🚀</h1>
          <p className="text-muted">
            Login to continue
          </p>
        </div>

        <div className="mb-3">
          <label className="form-label fw-semibold">
            Email
          </label>
          <input
            type="email"
            className="form-control"
            placeholder="Enter your email"
          />
        </div>

        <div className="mb-3">
          <label className="form-label fw-semibold">
            Password
          </label>
          <input
            type="password"
            className="form-control"
            placeholder="Enter your password"
          />
        </div>

        <button className="btn btn-primary w-100 py-2">
          Login
        </button>

        <p className="text-center mt-3 mb-0">
          Don't have an account?
          <a href="#" className="ms-2 text-decoration-none">
            Register
          </a>
        </p>
      </div>
    </div>
  );
}

export default App;