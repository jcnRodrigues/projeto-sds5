import { BrowserRouter, Switch, Route } from "react-router-dom";
import Home from "./pages/Home/intex";
import Dashboard from "./pages/Dashboard/index";

const Routes = () => {
  return (
    <BrowserRouter>
      <Switch>
        <Route path="/" exact>
          <Home />
        </Route>
        <Route path="/dashboard">
          <Dashboard />
        </Route>
      </Switch>
    </BrowserRouter>
  );
};

export default Routes;
