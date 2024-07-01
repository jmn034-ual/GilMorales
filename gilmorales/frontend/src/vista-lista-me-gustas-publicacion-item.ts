import { LitElement, html, css, customElement } from 'lit-element';
import '@vaadin/vaadin-avatar/src/vaadin-avatar.js';
import '@vaadin/vaadin-ordered-layout/src/vaadin-horizontal-layout.js';
import '@vaadin/vaadin-button/src/vaadin-button.js';

@customElement('vista-lista-me-gustas-publicacion-item')
export class VistaListaMeGustasPublicacionItem extends LitElement {
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
<vaadin-horizontal-layout class="content" style="justify-content: center; width: 100%;" id="layoutItem">
 <vaadin-horizontal-layout theme="spacing">
  <vaadin-avatar id="vaadinAvatar" style="align-self: center;"></vaadin-avatar>
  <vaadin-button theme="contrast" id="botonNombreUsuario" style="align-self: center; background-color: white;">
    Tertiary 
  </vaadin-button>
  <vaadin-button id="botonSeguir" style="align-self: center;" theme="contrast">
    Seguir 
  </vaadin-button>
 </vaadin-horizontal-layout>
</vaadin-horizontal-layout>
<hr>
`;
  }

  // Remove this method to render the contents of this view inside Shadow DOM
  createRenderRoot() {
    return this;
  }
}
