function App() {
  return (
    <div className="container mt-5">
      <div className="row justify-content-center">

        <div className="col-md-5">

          <div className="card shadow p-4">

            <h2 className="text-center mb-4">
              Login
            </h2>

            <input
              type="email"
              className="form-control mb-3"
              placeholder="Enter Email"
            />

            <input
              type="password"
              className="form-control mb-3"
              placeholder="Enter Password"
            />

            <button className="btn btn-primary w-100">
              Login
            </button>

          </div>

        </div>

      </div>
    </div>
  );
}

export default App;