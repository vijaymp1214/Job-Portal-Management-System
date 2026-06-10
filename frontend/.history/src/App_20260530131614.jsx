function App() {
  return (
    <div className="container-fluid vh-100 p-0">
      <div className="row g-0 h-100">

        {/* Left Section */}
        <div
          className="col-lg-7 d-none d-lg-flex flex-column justify-content-center text-white p-5"
          style={{
            background:
              "linear-gradient(135deg, #4F46E5 0%, #7C3AED 100%)",
          }}
        >
          <h1
            className="fw-bold"
            style={{ fontSize: "4rem" }}
          >
            Job Portal 🚀
          </h1>

          <p
            className="mt-3"
            style={{
              fontSize: "1.3rem",
              maxWidth: "600px",
            }}
          >
            Find your dream job, connect with top
            companies and build your future with a
            modern hiring platform.
          </p>
        </div>

        {/* Right Section */}
        <div className="col-lg-5 col-12 d-flex justify-content-center align-items-center bg-light">

          <div
            className="card border-0 shadow-lg"
            style={{
              width: "100%",
              maxWidth: "450px",
              borderRadius: "25px",
            }}
          >
            <div className="card-body p-5">

              <div className="text-center mb-4">
                <h2 className="fw-bold">
                  Welcome Back
                </h2>

                <p className="text-muted">
                  Login to your account
                </p>
              </div>

              <div className="mb-3">
                <label className="form-label">
                  Email
                </label>

                <input
                  type="email"
                  className="form-control form-control-lg"
                  placeholder="Enter Email"
                />
              </div>

              <div className="mb-3">
                <label className="form-label">
                  Password
                </label>

                <input
                  type="password"
                  className="form-control form-control-lg"
                  placeholder="Enter Password"
                />
              </div>

              <button className="btn btn-primary btn-lg w-100">
                Login
              </button>

              <div className="text-center mt-4">
                <span className="text-muted">
                  Don't have an account?
                </span>

                <a
                  href="#"
                  className="ms-2 text-decoration-none fw-bold"
                >
                  Register
                </a>
              </div>

            </div>
          </div>

        </div>

      </div>
    </div>
  );
}

export default App;