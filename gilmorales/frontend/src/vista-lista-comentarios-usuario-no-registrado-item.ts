import { LitElement, html, css, customElement } from 'lit-element';
import '@vaadin/vaadin-ordered-layout/src/vaadin-horizontal-layout.js';
import '@vaadin/vaadin-ordered-layout/src/vaadin-vertical-layout.js';
import '@vaadin/vaadin-avatar/src/vaadin-avatar.js';
import '@vaadin/vaadin-button/src/vaadin-button.js';

@customElement('vista-lista-comentarios-usuario-no-registrado-item')
export class VistaListaComentariosUsuarioNoRegistradoItem extends LitElement {
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
<vaadin-horizontal-layout class="content" id="vaadinHorizontalLayout" style="width: 100%;">
 <vaadin-horizontal-layout theme="spacing" id="vaadinHorizontalLayout1" style="align-self: center; flex-grow: 0; width: 15%; justify-content: center; flex-shrink: 0;">
  <vaadin-avatar id="fotoPerfil" style="align-self: center;"></vaadin-avatar>
 </vaadin-horizontal-layout>
 <vaadin-vertical-layout theme="spacing-s" id="vaadinVerticalLayout" style="align-self: center; flex-grow: 0; flex-shrink: 0; width: 53%;">
  <vaadin-button theme="tertiary" id="nombreUsuario">
    Nombre de usuario 
  </vaadin-button>
  <label id="comentarioL" style="flex-shrink: 0; align-self: stretch;">Comentario</label>
 </vaadin-vertical-layout>
 <vaadin-horizontal-layout theme="spacing" id="vaadinHorizontalLayout2" style="align-self: center; flex-grow: 0; justify-content: flex-end; flex-shrink: 0;">
  <label id="numeroMeGusta" style="align-self: center;">0</label>
  <label id="meGustaL" style="align-self: center;">Me gusta</label>
  <vaadin-button id="meGustaB">
    Me gusta 
  </vaadin-button>
  <vaadin-button id="denunciarB">
    Denunciar 
  </vaadin-button>
  <vaadin-button id="borrarComentarioB">
    Borrar 
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
