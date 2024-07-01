import { LitElement, html, css, customElement } from 'lit-element';
import '@vaadin/vaadin-ordered-layout/src/vaadin-horizontal-layout.js';
import '@vaadin/vaadin-button/src/vaadin-button.js';
import '@vaadin/vaadin-avatar/src/vaadin-avatar.js';

@customElement('vista-nuevos-seguirdores-item')
export class VistaNuevosSeguirdoresItem extends LitElement {
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
<vaadin-horizontal-layout class="content" style="width: 100%; justify-content: center;" id="nuevoSeguidor" theme="spacing">
 <vaadin-horizontal-layout theme="spacing" id="fotoPerfil" style="align-self: center;">
  <vaadin-avatar id="avatar"></vaadin-avatar>
 </vaadin-horizontal-layout>
 <vaadin-button id="nombreusuario" style="align-self: center;">
  NombreUsuario
 </vaadin-button>
 <vaadin-button id="botonEnviarSolicitud" style="align-self: center;">
   Enviar solicitud de amistad 
 </vaadin-button>
 <vaadin-button id="botonSeguir" style="align-self: center;">
   Seguir 
 </vaadin-button>
 <vaadin-horizontal-layout theme="spacing" id="privado">
  <vaadin-button id="botonCancelar" style="align-self: center;">
    Cancelar 
  </vaadin-button>
  <vaadin-button id="botonAceptar" style="align-self: center;">
    Aceptar solicitud de amistad 
  </vaadin-button>
 </vaadin-horizontal-layout>
</vaadin-horizontal-layout>
`;
  }

  // Remove this method to render the contents of this view inside Shadow DOM
  createRenderRoot() {
    return this;
  }
}
