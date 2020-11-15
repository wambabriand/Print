import React from 'react';
import { useAuthContext } from '../authentication/AuthContext';


function Login(){

    const {onLogin} = useAuthContext();

    return (<div>Login du site<br></br><br></br>

        {'email'}<input></input>
        {'password'}<input></input>
        <button onClick={(event)=>onLogin({user:'briand'})}>Login</button>

    </div>);
}

export default Login;
