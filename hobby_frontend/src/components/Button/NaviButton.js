import { useNavigate } from 'react-router-dom';
import './SubmitButton.css';

function SubmitButton({text, to}) {
    const navigate = useNavigate();

    const handleClick = () => {
        navigate(to);
    };

    return <button className="custom-button" onClick={handleClick}>{text}</button>;
}
export default SubmitButton;