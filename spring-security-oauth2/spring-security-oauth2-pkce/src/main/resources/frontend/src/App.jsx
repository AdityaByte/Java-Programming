import React, { useEffect, useState } from "react";
import { useOAuth } from "./config/authConfig";
import service from "./services/service";

const App = () => {

    const [ text, setText ] = useState('');
    const { login, logout, configureOAuth } = useOAuth();

    useEffect(() => {
        configureOAuth().then(() => {
            service.appService().then(response => setText(response))
        })
    }, [])

    return (
        <>
            <h1>Frontend</h1>
            <p>{text}</p>
            <button onClick={login}>Login</button>
            <button onClick={logout}>Logout</button>
        </>
    )
}

export default App