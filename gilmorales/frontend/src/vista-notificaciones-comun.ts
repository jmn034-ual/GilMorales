import { LitElement, html, css, customElement } from 'lit-element';
import '@vaadin/vaadin-ordered-layout/src/vaadin-vertical-layout.js';
import '@vaadin/vaadin-button/src/vaadin-button.js';

@customElement('vista-notificaciones-comun')
export class VistaNotificacionesComun extends LitElement {
  static get styles() {
    return css`
      :host {
          display: block;
          height: 100%;
      }
      `;
  }

  render() {
    return html`
<vaadin-vertical-layout style="width: 100%; height: 100%;" id="botonNombreUsuario">
 <h3 id="tituloNotificacion" style="align-self: center;">TituloNotificacion:</h3>
 <vaadin-button theme="tertiary" id="vaadinButton" style="align-self: center;">
  NombreUsuario
 </vaadin-button>
</vaadin-vertical-layout>
`;
  }

  // Remove this method to render the contents of this view inside Shadow DOM
  createRenderRoot() {
    return this;
  }
}
