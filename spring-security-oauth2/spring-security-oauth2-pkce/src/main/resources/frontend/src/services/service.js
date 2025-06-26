import { userManager } from "../config/authConfig";

const appService = async () => {

    const user = await userManager.getUser();
    const token = user?.access_token;

    console.log(token)

    const response = await fetch(`${import.meta.env.VITE_RESOURCE_SERVER_URL}`, {
        headers: {
            'Content-Type': 'text/plain; charset=utf-8',
            'Authorization': `Bearer ${token}`
        },
        responseType: "text"
    })

    if (!response.ok) throw new Error("Request failed");
    return await response.text();
}

export default { appService };